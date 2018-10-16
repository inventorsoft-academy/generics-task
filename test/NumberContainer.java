package test;

import java.util.List;

public class NumberContainer {

    private List<Integer> listOfIntegers = null;
    
    public void ShowFoo() {
      for(Integer data : listOfIntegers) {
          System.out.println(data);
      }
    }

    public List<Integer> getListOfIntegers() {
        return listOfIntegers;
    }

    public void setListOfIntegers(List<Integer> listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }
}
