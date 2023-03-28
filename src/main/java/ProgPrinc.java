import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;




public class ProgPrinc {
    static Scanner sc = new Scanner(System.in);
    static DemoCrudUser dbaccess = new DemoCrudUser();
    static User user1 = new User("adi","1");

    static Food food = new Food("food",1);

    public static void main(String[] args) throws IOException, SQLException {

        System.out.println("Login app food menu");

        long id = -1;
        User u = null;
        while (true) {
            System.out.println("Enter username:");
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            System.out.println("Enter password:");
            String pwd = sc.nextLine();
            u = new User(username, pwd);
            id = dbaccess.login(u);
            u.setId(id);
            if (id != -1)
                break;

        }

    
        while (true) {

            boolean isAdmin = dbaccess.isAdmin(u);

        if (!isAdmin) {
            //user menu.


            Scanner s = new Scanner(System.in);

            int ch;
            do {
                System.out.println("1.INSERT  FOOD FOR CURRENT USER");
                System.out.println("2.DISPLAY LIST OF FOOD FOR CURRENT ID USER");
                System.out.println("3.DELETE FOOD FROM LIST");
                System.out.println("4.UPDATE FOOD FROM LIST");
                System.out.println("5.Exit");
                System.out.print("Enter Your Choice : ");
                ch = s.nextInt();

                switch (ch) {
                    case 1:

                        System.out.println("Enter the foodname to add :");
                        dbaccess.insertFoodForUserID(food,id);
                        break;
                    case 2:
                        dbaccess.readFoodsOfAnUser();

                        break;
                    case 3:
                        dbaccess.deleteFood(food);
                        break;
                    case 4:
                        dbaccess.updateFood(food);
                        break;

                }
            } while (ch != 5);
            System.out.println("YOU EXIT THE APP");
            break;
        }


            //is admin
            while (true) {
                //admin user menu.

                Scanner s = new Scanner(System.in);
                Scanner s1 = new Scanner(System.in);
                int ch2;
                do {
                    System.out.println("******* Admin menu ******* ");
                    System.out.println("1.INSERT  USER OR ADMIN");
                    System.out.println("2.DISPLAY LIST OF USER");
                    System.out.println("3.DELETE USER");
                    System.out.println("4.UPDATE USER LIST");
                    System.out.println("5.Exit");
                    System.out.print("Enter Your Choice : ");
                    ch2 = s.nextInt();

                    switch (ch2) {
                        case 1:
                            dbaccess.createUser(user1,false);

                            break;
                        case 2:
                            dbaccess.read();
                            break;
                        case 3:
                            dbaccess.delete(user1);

                            break;
                        case 4:
                            dbaccess.update(user1);
                            break;
                    }


                }
                while (ch2 != 5);
                System.out.println("YOU EXIT THE APP");
                break;
            }
        }
    }
}




