/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES", schema = "TEST")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> implements org.jooq.Record8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> {

	private static final long serialVersionUID = 1367712852;

	/**
	 * Setter for <code>TEST.T_DATES.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_DATES.D</code>. 
	 */
	public void setD(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.D</code>. 
	 */
	@javax.persistence.Column(name = "D", length = 7)
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_DATES.T</code>. 
	 */
	public void setT(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.T</code>. 
	 */
	@javax.persistence.Column(name = "T", length = 11)
	public java.sql.Timestamp getT() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_DATES.TS</code>. 
	 */
	public void setTs(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.TS</code>. 
	 */
	@javax.persistence.Column(name = "TS", length = 11)
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_DATES.D_INT</code>. 
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.D_INT</code>. 
	 */
	@javax.persistence.Column(name = "D_INT", precision = 7)
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_DATES.TS_BIGINT</code>. 
	 */
	public void setTsBigint(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.TS_BIGINT</code>. 
	 */
	@javax.persistence.Column(name = "TS_BIGINT", precision = 18)
	public java.lang.Long getTsBigint() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>TEST.T_DATES.I_Y</code>. 
	 */
	public void setIY(org.jooq.types.YearToMonth value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.I_Y</code>. 
	 */
	@javax.persistence.Column(name = "I_Y", precision = 2)
	public org.jooq.types.YearToMonth getIY() {
		return (org.jooq.types.YearToMonth) getValue(6);
	}

	/**
	 * Setter for <code>TEST.T_DATES.I_D</code>. 
	 */
	public void setID(org.jooq.types.DayToSecond value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.T_DATES.I_D</code>. 
	 */
	@javax.persistence.Column(name = "I_D", precision = 2, scale = 6)
	public org.jooq.types.DayToSecond getID() {
		return (org.jooq.types.DayToSecond) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.YearToMonth> field7() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.I_Y;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.DayToSecond> field8() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.I_D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.YearToMonth value7() {
		return getIY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.DayToSecond value8() {
		return getID();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES);
	}
}
