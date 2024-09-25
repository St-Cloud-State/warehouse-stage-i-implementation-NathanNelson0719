//Nathan Nelson

import java.util.Iterator;

public class WarehouseDriver {
    public static void main(String[] args) {
        // Create a ClientList object
        ClientList clientList = new ClientList();

        // Create and add a few Client objects
        Client client1 = new Client("Nathan Nelson", "101 Main St", "555-1234");
        Client client2 = new Client("Group Twelve", "999 Oak St", "555-5678");

        // Insert clients into the client list
        clientList.insertClient(client1);
        clientList.insertClient(client2);

        // Display all clients
        System.out.println("All clients:");
        Iterator<Client> clientIterator = clientList.getClients();
        while (clientIterator.hasNext()) {
            Client client = clientIterator.next();
            System.out.println("Client ID: " + client.getID() + ", Name: " + client.getName() +
                               ", Address: " + client.getAddress() + ", Phone: " + client.getPhone());
        }

        // Search for a specific client by ID
        System.out.println("\nSearching for client with ID: " + client1.getID());
        Client foundClient = clientList.search(client1.getID());
        if (foundClient != null) {
            System.out.println("Found client: " + foundClient.getName());
        } else {
            System.out.println("Client not found.");
        }
    }
}
