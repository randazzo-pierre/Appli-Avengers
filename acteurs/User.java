package acteurs;

public class User {

   public String username;
   private String password;
   public String role;
   public String create_time;
   public int id;

   public User(String username, String password, String role, String create_time, int id) {

      this.username = username;
      this.password = password;
      this.role = role;
      this.create_time = create_time;
      this.id = id;

   }

   // public UserRegister(""+ String userName, String password, + "CIVIL," + String
   // debut + ", id"){
   // //connexion bdd
   // dbUtil utl = new dbUtil() ;
   // Connection cnx = utl.dbConnect() ;
   // try {
   // String request = "INSERT INTO USER VALUES('"+userName+"', '"+password+"',
   // 'CIVIL', '"+debut+"', 'id')" ;
   // System.out.println(request);
   // int insert = utl.dbCreate(cnx, request) ;
   // this.setidI(insert);
   // utl.dbKill(cnx) ;
   // System.out.println("insertion ok");
   // } catch(SQLException e){
   // System.out.println(e);
   // }
   // //return this.idI ;
   // }

   /**
    * @return String
    */
   public String getUsername() {
      return username;
   }

   /**
    * @return String
    */
   public String getPassword() {
      return password;
   }

   /**
    * @return String
    */
   public String getRole() {
      return role;
   }

   /**
    * @return String
    */
   public String getDate() {
      return create_time;
   }

   /**
    * @return int
    */
   public int getidC() {
      return id;
   }

}
