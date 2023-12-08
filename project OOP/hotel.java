class Customer{
    private String name;
    private String email;
    private int phonenumber;

    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
        System.out.println("Name : " + name);

    }

    public String getemail(){
        return this.email;
    }
    public void setemail(String email){
        this.email = email;
        System.out.println("Email : " + email);

    }

    public int getphonenumber(){
        return this.phonenumber;
    }
    public void setphonenumber(int phonenumber){
        this.phonenumber = phonenumber;
        System.out.println("Phonenumber : " + phonenumber);

    }
}

class checkin extends Customer {
    private  int checkin;

    public int getcheckin(){
        return this.checkin;
    }
    public void setcheckin(int checkin){
      this.checkin = checkin;
    System.out.println("checkin : " + checkin);
    }

}
class checkout extends Customer{
    private int checkout;

    public int getcheckout(){
        return this.checkout;
    }
    public void setcheckout(int checkout){
      this.checkout = checkout;
      System.out.println("checkout : " + checkout);
    }
}