public class Client {

    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(),new Facebook(),new LinkedIn());
        socialMediaFacade.Share(message);
    }

    public static void main(String[] args) {
        Client client = new  Client();
        client.share("this is the port");
    }
}
