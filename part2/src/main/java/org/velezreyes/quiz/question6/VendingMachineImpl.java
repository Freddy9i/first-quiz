package org.velezreyes.quiz.question6;

import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {

  private int currentMoney;
  private HashMap<String, Integer> drinksPrices = new HashMap<String, Integer>();
  
  public VendingMachineImpl() {
    currentMoney = 0;
    drinksPrices.put("ScottCola", 75);
    drinksPrices.put("KarenTea", 100);
  }

  public void insertQuarter() {
    currentMoney += 25;
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (drinksPrices.containsKey(name)) {
      if (currentMoney >= drinksPrices.get(name)){

        return new DrinkImpl(name);
      }
      else {
        throw new NotEnoughMoneyException();
      }
    }
    else {
      throw new UnknownDrinkException();
    }

    
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }
}
