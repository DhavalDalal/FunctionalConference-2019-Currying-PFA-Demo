import java.util.*;

interface Transaction { }

interface ApprovalStrategy {
  boolean approve(List<Transaction> ts);
}

class SingleMakerChecker implements ApprovalStrategy {
  public boolean approve(List<Transaction> ts) {
    System.out.println("SingleMakerChecker approve...");
    return true;
  }
}

class Clearing {
  private final ApprovalStrategy aps; 

  Clearing(ApprovalStrategy aps) { 
     this.aps = aps;
  }

  public boolean clear(List<Transaction> ts) {
    return aps.approve(ts);
  }   
}

class _2_CurriedDI {
  public static void main(String[] args) {
    ApprovalStrategy singleMakerChecker = new SingleMakerChecker();
    Clearing clearing = new Clearing(singleMakerChecker);
    clearing.clear(Arrays.asList());
    System.out.println("Done!");
  }
}