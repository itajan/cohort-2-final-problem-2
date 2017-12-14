package edu.cnm.deepdive.springdatarestpeople.person;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;

  @CreationTimestamp
  private Date created;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreated() {
    return created;
  }
}
