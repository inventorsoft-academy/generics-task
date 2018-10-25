package test;

import java.util.List;

public class  NumberContainer {

    private List<? extends Number>  listOfNumbers = null;
    
    public void ShowFoo() {
      for(Number data : listOfNumbers) {
          System.out.println(data);
      }
    }

    public List<? extends Number> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfIntegers(List<? extends Number> listOfNUmbers) {
        this.listOfNumbers = listOfNUmbers;
    }

    public Number getElemByIndex(int index) {
        Number elem = listOfNumbers.get(index);
        return elem;
    }

    @Override
    public String toString() {
        return "NumberContainer{" +
                "listOfNumbers=" + listOfNumbers +
                '}';
    }
}
