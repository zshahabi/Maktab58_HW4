package model;

import enums.TransactionType;

public class Transaction {
   private long fromPerson;
   private long amount;
   private MyDate dateOfTr;
   private TransactionType transactionType;

   public Transaction(long fromPerson, long amount, MyDate dateOfTr, TransactionType transactionType) {
      this.fromPerson = fromPerson;
      this.amount = amount;
      this.dateOfTr = dateOfTr;
      this.transactionType = transactionType;
   }

   public long getFromPerson() {
      return fromPerson;
   }

   public void setFromPerson(long fromPerson) {
      this.fromPerson = fromPerson;
   }

   public long getAmount() {
      return amount;
   }

   public void setAmount(long amount) {
      this.amount = amount;
   }

   public MyDate getDateOfTr() {
      return dateOfTr;
   }

   public void setDateOfTr(MyDate dateOfTr) {
      this.dateOfTr = dateOfTr;
   }

   public TransactionType getTransactionType() {
      return transactionType;
   }

   public void setTransactionType(TransactionType transactionType) {
      this.transactionType = transactionType;
   }
}
