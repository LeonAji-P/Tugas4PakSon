package Main;


class User {
      private String Username;
      private String Password;

      //method setter
      public void setUsername(String Username){
      this.Username = Username;
      }
      
      public void setPassword(String Password){
      this.Password = Password;
      }
      
      //method getter
      public String getUsername(){
          return this.Username;
      }
      
      public String getPassword(){
          return this.Password;
      
        }
    }