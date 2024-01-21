package day04_practice_tasks;

public class HttpStatusCode {

    public static void main(String[] args) {

        int statusCode =200;

        switch (statusCode){
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved permanently");
                break;
            case 303:
                System.out.println("See other");
                break;
            case 304:
                System.out.println("Not modofied");
                break;
            case 307:
                System.out.println("Temporary redirect");
                break;
            case 400:
                System.out.println("Bad request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal server error");
                break;
            case 503:
                System.out.println("Service Unavailable");
            default:
                System.out.println("Invalid");
        }





    }
}
