/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_INCOMPLETE", schema = "TEST")
public class VIncompleteRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord> implements org.jooq.Record9<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> {

	private static final long serialVersionUID = 599008903;

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.ID</code>. 
	 */
	public void setId(java.lang.Object value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID")
	public java.lang.Object getId() {
		return (java.lang.Object) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR_ID")
	public java.lang.Object getAuthorId() {
		return (java.lang.Object) getValue(1);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.lang.Object value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Object getCoAuthorId() {
		return (java.lang.Object) getValue(2);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Object value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>. 
	 */
	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Object getDetailsId() {
		return (java.lang.Object) getValue(3);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.TITLE</code>. 
	 */
	public void setTitle(java.lang.Object value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE")
	public java.lang.Object getTitle() {
		return (java.lang.Object) getValue(4);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Object value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>. 
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN")
	public java.lang.Object getPublishedIn() {
		return (java.lang.Object) getValue(5);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Object value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>. 
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID")
	public java.lang.Object getLanguageId() {
		return (java.lang.Object) getValue(6);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.Object value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.Object getContentText() {
		return (java.lang.Object) getValue(7);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(java.lang.Object value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>. 
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public java.lang.Object getContentPdf() {
		return (java.lang.Object) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field7() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field8() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field9() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value9() {
		return getContentPdf();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VIncompleteRecord
	 */
	public VIncompleteRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE);
	}
}
