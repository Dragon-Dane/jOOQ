/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -377314563;

	/**
	 * The singleton instance of <code>TEST.T_AUTHOR</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TAuthor T_AUTHOR = new org.jooq.test.oracle.generatedclasses.test.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>TEST.T_AUTHOR.ID</code>. The author ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>TEST.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>TEST.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>TEST.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> ADDRESS = createField("ADDRESS", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType(), this);

	/**
	 * Create a <code>TEST.T_AUTHOR</code> table reference
	 */
	public TAuthor() {
		super("T_AUTHOR", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_AUTHOR</code> table reference
	 */
	public TAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TAuthor(alias);
	}
}
