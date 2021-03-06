/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YishaiBasserabie
 */
public class venueArray {
    ConnectDB db = new ConnectDB();
    private ArrayList<fetchVenue> venuesArray = new ArrayList<>();

    public venueArray() {
        ResultSet r = db.getResults("SELECT * FROM venues");
        try {
            while(r.next()) {
                fetchVenue fv = new fetchVenue(r.getInt("venueID"), r.getString("venue"));
                venuesArray.add(fv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(venueArray.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error, please contact administrator at 0836570642");
            JOptionPane.showMessageDialog(null, "venue");
        }
    }

    public ArrayList<fetchVenue> getVenuesArray() {
        return venuesArray;
    }

    public void setVenuesArray(ArrayList<fetchVenue> venuesArray) {
        this.venuesArray = venuesArray;
    }
    
    public int venueIDFromVenue(String venue) {
        int id = 0;
        for (int i = 0; i < venuesArray.size(); i++) {
            if (this.venuesArray.get(i).getVenue().equals(venue)) {
                id = this.venuesArray.get(i).getVenueID();
            }
        }
        return id;
    }
    
    public String venueNameFromID(int id) {
        String name = "";
        for (int i = 0; i < this.venuesArray.size(); i++) {
            if (id == this.venuesArray.get(i).getVenueID()) {
                name = this.venuesArray.get(i).getVenue();
            }
        }
        return name;
    }
    
    public int getVenueIDFromLessonID(int lessonID) {
        lessonDataArray la = new lessonDataArray();
        int venueID = 0;
        
        for (int i = 0; i < la.getLessonDataArray().size(); i++) {
            if (la.getLessonDataArray().get(i).getLessonID() == lessonID) {
                venueID = la.getLessonDataArray().get(i).getVenueID();
            }
        }
        return venueID;
    }
    
    
    
    public void deleteVenue(String Delvenue, String repVenue) {
        ConnectDB db = new ConnectDB();
        lessonDataArray la = new lessonDataArray();
        
        int delVid = this.venueIDFromVenue(Delvenue);
        int refVid = this.venueIDFromVenue(repVenue);
        
        if (delVid != refVid) {
            for (int i = 0; i < la.getLessonDataArray().size(); i++) {
                int Vid = la.getLessonDataArray().get(i).getVenueID();
                if (delVid == Vid) {
                    String editVenue = "UPDATE lessonData SET VenueID = " + refVid + " WHERE VenueID = " + delVid;
                    try {
                        db.UpdateDatabase(editVenue);
                    } catch (SQLException ex) {
                        Logger.getLogger(venueArray.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            String delete = "DELETE * FROM venues WHERE venue = '" + Delvenue + "'";
            try {
                db.UpdateDatabase(delete);
            } catch (SQLException ex) {
                Logger.getLogger(venueArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "you cannot select the replacement venue as the same as the venue to delete!\n");
        }
        
        
    }
    
    public void addVenue(String venue) {
        ConnectDB db = new ConnectDB();
        
        String insert = "INSERT INTO venues (venue) VALUES ('" + venue + "')";
        try {
            db.UpdateDatabase(insert);
        } catch (SQLException ex) {
            Logger.getLogger(addVenueForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
