package MachineCoding;

import MachineCoding.exceptions.OperationNotFoundException;
import MachineCoding.service.OperationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws IOException {
        OperationService operationService = new OperationService();
        System.out.println("******Welcome to FlipKart Machine Coding ******");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            System.out.println("Please enter the operation \n");
            String operation = null;
            try {
                operation = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (operation) {

                case "register":
                    System.out.println("Please Name\n");
                    String name = bufferedReader.readLine();
                    System.out.println("Please emailId\n");
                    String emailId = bufferedReader.readLine();
                    int userId = operationService.registerUser(name,emailId);
                    System.out.println(userId);
                    break;






            }
        }
    }
}
