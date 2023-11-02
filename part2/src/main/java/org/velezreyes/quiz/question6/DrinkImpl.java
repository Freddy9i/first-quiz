package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    private String name;
    private boolean isFizzy;
    private String[] fizzyDrinks = {"ScottCola"};
  
    public DrinkImpl(String name) {
      this.name = name;
      this.isFizzy = false;
      for (String drink : fizzyDrinks) {
        if (drink.equals(name)) {
          this.isFizzy = true;
        }
      }
    }
  
    public String getName() {
      return name;
    }
    
    public boolean isFizzy() {
      return isFizzy;
    }
  
  }

