package client.model;

public class User {
    
    private int id;
    private String username;
    private String password;
    private String type;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setUserName(String username){
        this.username = username;
    }
    
    public String getUserName(){
        return username;
    }
    
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
}    
