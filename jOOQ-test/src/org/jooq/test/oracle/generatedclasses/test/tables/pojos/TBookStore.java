/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_STORE", schema = "TEST")
public class TBookStore implements java.io.Serializable {

	private static final long serialVersionUID = 775675634;

	private java.lang.String name;

	@javax.persistence.Id
	@javax.persistence.Column(name = "NAME", unique = true, nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
}
