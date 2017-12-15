package edu.cnm.deepdive.springdatarestpeople.person;


import edu.cnm.deepdive.springdatarestpeople.group.Group;
import edu.cnm.deepdive.springdatarestpeople.membership.Membership;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class that defines the database entity "Person"
 */
@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.ALL)
  private List<Group> groupies = new LinkedList<>();

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "person", cascade = CascadeType.ALL)
  private List<Membership> memberships = new LinkedList<>();

  @Temporal(TemporalType.DATE)
  @Column(nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date created;

  private String name;

  /**
   * Constructor for person
   */
  public Person() {

  }

  /**
   * @param name Provides the name parameter
   */
  public Person(String name) {
    this.name = name;
  }

  /**
   * @return Returns an id
   */
  public long getId() {
    return id;
  }

  /**
   * @return Gets a string of names
   */
  public String getName() {
    return name;
  }

  /**
   * @param name Sets a string of names
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return Gets a creation date
   */
  public Date getCreated() {
    return created;
  }

  /**
   * @return Returns a list of groups
   */
  public List<Group> getGroupies() {
    return groupies;
  }

  /**
   * @param groupies Sets a list of groups
   */
  public void setGroupies(List<Group> groupies) {
    this.groupies = groupies;
  }

  /**
   * @return Gets a list of memberships
   */
  public List<Membership> getMemberships() {
    return memberships;
  }

  /**
   * @param memberships Sets a list of memberships
   */
  public void setMemberships(List<Membership> memberships) {
    this.memberships = memberships;
  }
}
