// Handler Interface
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(String issue);
}

// Concrete Handlers
class BasicSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) {
            System.out.println("BasicSupport: Handling basic issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class IntermediateSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Intermediate")) {
            System.out.println("IntermediateSupport: Handling intermediate issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class AdvancedSupport extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("Advanced")) {
            System.out.println("AdvancedSupport: Handling advanced issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler intermediate = new IntermediateSupport();
        SupportHandler advanced = new AdvancedSupport();
        
        basic.setNextHandler(intermediate);
        intermediate.setNextHandler(advanced);
        
        basic.handleRequest("Basic");       // BasicSupport: Handling basic issue.
        basic.handleRequest("Intermediate"); // IntermediateSupport: Handling intermediate issue.
        basic.handleRequest("Advanced");    // AdvancedSupport: Handling advanced issue.
    }
}
