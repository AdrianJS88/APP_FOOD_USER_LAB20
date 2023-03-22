public class Food {
        private String foodname;
        private int iduser;
        private int id;

        public Food(String foodname, int iduser) {
            this.foodname = foodname;
            this.iduser=iduser;
        }

        public int getIduser() {
            return iduser;
        }

        public void setIduser(int iduser) {
            this.iduser = iduser;
        }

        public String getFoodname() {
            return foodname;
        }

        public void setFoodname(String foodname) {
            this.foodname = foodname;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "foodname='" + foodname + '\'' +
                    '}';
        }
    }
