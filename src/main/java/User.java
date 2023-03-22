public class User {
        private String username;
        private String password;
        private long id;

        boolean isadmin;


        public User(String username, String password) {
            this.username = username;
            this.password = password;


        }

        public boolean isIsadmin() {
            return isadmin;
        }

        public void setIsadmin(boolean isadmin) {
            this.isadmin = isadmin;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return  "username= " + username + "," + " " +
                    "password= " + password + "," + " " +
                    "id= " + id + "," + " " +
                    "isadmin= " + isadmin + ";" + '\n';
        }
    }

