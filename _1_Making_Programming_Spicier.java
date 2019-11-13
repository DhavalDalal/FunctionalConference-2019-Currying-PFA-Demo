import java.util.*;
import java.util.function.*;

class Customer {
  public final int id;
  
  Customer(final int id) { this.id = id; }
  public String toString() { return String.format("Customer(%d)", id); }
}

class CustomerRepository {
  Optional<Customer> findById(Integer id) {
    return (id > 0) ? Optional.of(new Customer(id)) 
                    : Optional.empty();
  }   
}

class Request {
  public final int id;
  private Map<String, String> params = new HashMap<>();
  
  Request(int id) { this.id = id; }
  
  String set(String key, String value) { return params.put(key, value); }
  
  String get(String key) { return params.get(key); }
}

class Authoriser {
  public Optional<Customer> authorise(CustomerRepository repo, Request request) {
    System.out.println("Authorizing Request#" + request.id);
    // Some auth code here which guards the request.
    // On success, the line below is executed.
    return repo.findById(Integer.parseInt(request.get("id")));
  }
}

class _1_Making_Programming_Spicier {
  public static void main(String[] args) {
    var authoriser = new Authoriser();
    var repo = new CustomerRepository();

    var request1 = new Request(1) {{
      set("id", "10");
    }};

    var customer1 = authoriser.authorise(repo, request1);
    System.out.println(customer1);

    var request2 = new Request(2) {{
      set("id", "30");
    }};
    var customer2 = authoriser.authorise(repo, request2);
    System.out.println(customer2);

    System.out.println("Done!");
  }
}