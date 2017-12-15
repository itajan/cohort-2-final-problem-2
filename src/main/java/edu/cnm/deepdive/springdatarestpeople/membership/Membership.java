package edu.cnm.deepdive.springdatarestpeople.membership;

import edu.cnm.deepdive.springdatarestpeople.group.Group;
import edu.cnm.deepdive.springdatarestpeople.person.Person;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

/**
 * Class that defines the "Membership" entity
 */
@Entity(name = "GroupMember")
public class Membership {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;

  @CreationTimestamp
  @Column(nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Date created;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "person_id")
  private Person person;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "group_id")
  private Group group;

  /**
   * Membership constructor
   */
  public Membership() {

  }

  /**
   * @return Returns an id
   */
  public long getId() {
    return id;
  }

  /**
   * @return Returns a created date/time
   */
  public Date getCreated() {
    return created;
  }

  /**
   * @return Returns a person
   */
  public Person getPerson() {
    return person;
  }

  /**
   * @param person Sets the person field
   */
  public void setPerson(Person person) {
    this.person = person;
  }

  /**
   * @return Returns a group
   */
  public Group getGroup() {
    return group;
  }

  /**
   * @param group Sets the group field
   */
  public void setGroup(Group group) {
    this.group = group;
  }
}
