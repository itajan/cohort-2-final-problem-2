package edu.cnm.deepdive.springdatarestpeople.group;

import edu.cnm.deepdive.springdatarestpeople.membership.Membership;
import edu.cnm.deepdive.springdatarestpeople.person.Person;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class that defines the entity "Group"
 */
@Entity(name = "Groupies")
public class Group {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @Temporal(TemporalType.DATE)
  @Column(nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date created;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "group", cascade = CascadeType.ALL)
  private List<Membership> memberships = new LinkedList<>();

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_id")
  private Person person;

  private String name;

  /**
   * Constructor for Group
   */
  public Group() {
  }

  /**
   * @param name Group name string
   */
  public Group(String name) {
    this.name = name;
  }

  /**
   * @return Returns an id
   */
  public long getId() {
    return id;
  }

  /**
   * @return Returns a name
   */
  public String getName() {
    return name;
  }

  /**
   * @return Returns a creation date
   */
  public Date getCreated() {
    return created;
  }

  /**
   * @return Returns a list of memberships
   */
  public List<Membership> getMemberships() {
    return memberships;
  }

  /**
   * @param memberships Sets the list "memberships"
   */
  public void setMemberships(
      List<Membership> memberships) {
    this.memberships = memberships;
  }

  /**
   * @return Returns a person
   */
  public Person getPerson() {
    return person;
  }

  /**
   * @param person Sets the "person" field
   */
  public void setPerson(Person person) {
    this.person = person;
  }
}
