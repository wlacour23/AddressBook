//class like it was given
    public class AddressBookEntry {

        private String firstname;
        private String lastname;
        private String address;
        private int mobilenumber;
        private String emailaddress;

        public AddressBookEntry() {}

        public AddressBookEntry(String name, String secondname, String address,
                                int mobilenumber, String emailaddress){
            this.firstname = name;
            this.lastname = secondname;
            this.address = address;
            this.mobilenumber = mobilenumber;
            this.emailaddress = emailaddress;
        }

        public String getName(){

            return firstname;
        }
        public void setName(String name){

            this.firstname = name;
        }

        public String getSecondName(){

            return lastname;
        }
        public void setSecondName(String name){

            this.lastname = name;
        }

        public String getAddress(){

            return address;
        }
        public void setAddress(String address){

            this.address = address;
        }

        public int getMobileNumber(){

            return mobilenumber;
        }
        public void setMobileNumber(int mobilenumber){
            this.mobilenumber = mobilenumber;}

        public String getEmailAddress(){

            return emailaddress;
        }
        public void setEmailAddress(String emailaddress){

            this.emailaddress = emailaddress;
        }

        public String toString(){
            return "Name: " + firstname + ", Second Name: " + lastname + ", Address: " + address +
                    ", Mobile Number: " + mobilenumber + ", Email Address: " + emailaddress;
        }
    }

