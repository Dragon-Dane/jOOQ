/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 671470529;

	/**
	 * The singleton instance of <code>public.t_639_numbers_table</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>public.t_639_numbers_table.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_639_numbers_table.short</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("short", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>public.t_639_numbers_table.integer</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("integer", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_639_numbers_table.long</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("long", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.t_639_numbers_table.byte_decimal</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("byte_decimal", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>public.t_639_numbers_table.short_decimal</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("short_decimal", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>public.t_639_numbers_table.integer_decimal</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("integer_decimal", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_639_numbers_table.long_decimal</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("long_decimal", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>public.t_639_numbers_table.big_integer</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(22), this);

	/**
	 * The column <code>public.t_639_numbers_table.big_decimal</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("big_decimal", org.jooq.impl.SQLDataType.NUMERIC.precision(22, 5), this);

	/**
	 * The column <code>public.t_639_numbers_table.float</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Float> FLOAT = createField("float", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * The column <code>public.t_639_numbers_table.double</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("double", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>public.t_639_numbers_table</code> table reference
	 */
	public T_639NumbersTable() {
		super("t_639_numbers_table", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_639_numbers_table</code> table reference
	 */
	public T_639NumbersTable(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable(alias);
	}
}
