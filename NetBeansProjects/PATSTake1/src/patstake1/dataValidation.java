/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patstake1;

/**
 *
 * @author YishaiBasserabie
 */
public class dataValidation {// contains validating methods
    private String problems = "";

    public String getProblems() {
        return problems;
    }
    
    public boolean checkName(String input, String ForL) {//checks if a name string is valid
        boolean ok = true;//creates variable that holds value of valid/non-valid
        if (!input.equals("")) {//checks if something is entered
            for (int i = 0; i < input.length(); i++) {//loops through inputted string
            if (!Character.isAlphabetic(input.charAt(i))) {//checks if character at i is alphabetic
                if (ForL.equals("f")) {
                    problems += "()it seems you have an invalid character in your first Name\n";
                } else {
                    if (ForL.equals("l")) {
                        problems += "()it seems you have an invalid character in your last name\n";
                    } else {
                        if (ForL.equals("mf")) {
                            problems += "()it seems you have an invalid character in the parent's first name\n";
                        } else {
                            problems += "()it seems you have an invalid character in the parent's last name\n";
                        }
                    } 
                }
                ok = !ok;//flips value of ok to false
            }
        }
      } else {
            if (ForL.equals("f")) {
                problems += "()oh no you have left first name blank\n";
            } else {
                if (ForL.equals("l")) {
                    problems += "()oh no you have last name blank\n";
                } else {
                    if (ForL.equals("mf")) {
                        problems += "()oh no you have the parent's first name blank\n";
                    } else {
                        problems += "()oh no you have the parent's last name blank\n";
                    }
                }
            }
            ok = !ok;//flips ok to false
        }
        return ok;//returns ok
    }
    
    public boolean checkNum(String inputString, int start, int end) {//checks if a number is valid
        boolean ok = true;//creates variable that holds value of valid/non-valid
        if (!inputString.equals("")) {//checks if somethng is entered
            int input = Integer.parseInt(inputString);//converts string imputString to int input
            if (input >= start && input <= end) {// checks if input is between parametres
                ok = !ok;//flips value of ok to false
            }
        } else {
            ok = !ok;//flips ok to false
        }
        return ok;//returns ok
    }
    
    public boolean checkCell(String cell) {
        boolean ok = true;
        if (cell.equals("")) {
            problems += "()you have left cell blank!\n";
            ok = !ok;
        } else {
            if (cell.length() != 10) {
                problems += "()the cell number you have entered is of invalid length!\n";
                ok = false;
            }
        }
        return ok;
    }
    
    public boolean checkEmail(String input) {//validates inputted email
        boolean ok = true;//creates variable that holds value of valid/non-valid
        if (!input.equals("")) {//checks if something was entered
            if (!input.contains("@") || !input.contains(".")) {
                ok = false;//flips ok to false
                problems += "()email invalid please try again dude!\n";
            }
        } else {
            ok = false;//flips ok to false
            problems += "()you have left email blank\n";
        }
        return ok;//returns ok
    }
    
    public boolean checkPassword(String password, String confirmPassword) {
        boolean ok = true;
        if (!password.equals("")) {
            if (password.length() < 8) {
                ok = false;
                problems += "()password must be at least 8 charachters!\n";
            }
        } else {
            ok = false;
            problems += "()oy vey! you have left the password field blank\n";
        }
        if (!password.equals(confirmPassword)) {
            ok = false;
            problems += "()password do not match\n";
        }
        return ok;
    }
    
    public boolean checkBlank(String input) {
        boolean ok = true;
        if (input.equals("")) {
            ok = !ok;
        }
        return ok;
    }
    
    public boolean checkCost(String cost) {
        boolean ok = true;
        boolean alphabetical = false;
        boolean negative = false;
        if (!this.checkBlank(cost)) {
            ok = false;
            problems += "()please enter a cost.\n";
        }
        if (cost.contains(".") || cost.contains(",")) {
            ok = false;
            problems += "()please enter the cost as an integer.\n";
        } else {
            for (int i = 0; i < cost.length(); i++) {
                if (Character.isAlphabetic(cost.charAt(i))) {
                    ok = false;
                    alphabetical = true;
                } else {
                    if (Integer.parseInt(cost) < 0) {
                        ok = false;
                        negative = true;
                    }
                }
            }
            if (alphabetical) {
                problems += "()please do not enter any alphabetical symbols in the cost.\n";
            } else {
                if (negative) {
                    problems += "()please cost must be positive.\n";
                }
            }
        }
        return ok;
    }
    
    public boolean checkAddLesson(String date, String time, int students, String cost) {
        boolean ok = true;
        if (time.equals("0")) {
            ok = false;
            problems += "()please select a time.\n";
        }
        if (students == 0) {
            ok = false;
            problems += "()please add at least one student to the lesson.\n";
        }
        if (!this.checkCost(cost)) {
            ok = false;
        }
        return ok;
    }
    
    public boolean checkAddStudent(String sfname, String slname, String mfname, String mlname, String email, String cell) {
        studentsArray sa = new studentsArray();
        boolean ok = true;
        
        for (int i = 0; i < sa.getStudentArray().size(); i++) {
            String fname = sa.getStudentArray().get(i).getfName();
            String lname = sa.getStudentArray().get(i).getlName();
            if (fname.toLowerCase().equals(sfname.toLowerCase()) && lname.toLowerCase().equals(slname.toLowerCase())) {
                ok = false;
            }
        }
        if (!ok) {
            problems += "**You have already added this student to the database!\n";
        }
        if (!this.checkName(sfname, "f")) {
            ok = false;
        }
        if (!this.checkName(slname, "l")) {
            ok = false;
        }
        if (!this.checkName(mfname, "mf")) {
            ok = false;
        }
        if (!this.checkName(mlname, "ml")) {
            ok = false;
        }
        if (!this.checkEmail(email)) {
            ok = false;
        }
        if (!this.checkCell(cell)) {
            ok = false;
        }
        if (!ok) {
            problems += "**Please ensure you have enetered the correct grade and school";
        }
        return ok;
    }
    
    public boolean checkAddVenue(String venue) {
        venueArray va = new venueArray();
        boolean ok = true;
        
        if (this.checkBlank(venue)) {
            for (int i = 0; i < va.getVenuesArray().size(); i++) {
                String venueVA = va.getVenuesArray().get(i).getVenue();
                if (venueVA.toLowerCase().equals(venue.toLowerCase())) {
                    ok = false;
                }
            }
            if (!ok) {
                problems += "**You have already enetered this vanue to the database!\n";
            } else {
                String newV = venue.replaceAll(" ", "");
                for (int i = 0; i < newV.length(); i++) {
                    if (!Character.isAlphabetic(newV.charAt(i))) {
                        ok = false;
                    }
                }
                if (!ok) {
                    problems += "()oy vey! There is an invalid character in the venue!\n";
                }
            }
        } else {
            ok = false;
            problems += "()please do not leave the venue blank!\n";
        }
        
        return ok;
    }
    
}
