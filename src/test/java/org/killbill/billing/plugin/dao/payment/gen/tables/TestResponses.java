/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.dao.payment.gen.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestResponses extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord> {

	private static final long serialVersionUID = -1905352755;

	/**
	 * The reference instance of <code>killbill.test_responses</code>
	 */
	public static final org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses TEST_RESPONSES = new org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord> getRecordType() {
		return org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord.class;
	}

	/**
	 * The column <code>killbill.test_responses.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, org.jooq.types.UInteger> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.kb_account_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.kb_payment_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> KB_PAYMENT_ID = createField("kb_payment_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.kb_payment_transaction_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> KB_PAYMENT_TRANSACTION_ID = createField("kb_payment_transaction_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.transaction_type</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> TRANSACTION_TYPE = createField("transaction_type", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.amount</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.math.BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(15, 9).nullable(false), this, "");

	/**
	 * The column <code>killbill.test_responses.currency</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR.length(3), this, "");

	/**
	 * The column <code>killbill.test_responses.additional_data</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.lang.String> ADDITIONAL_DATA = createField("additional_data", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>killbill.test_responses.created_date</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, java.sql.Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * Create a <code>killbill.test_responses</code> table reference
	 */
	public TestResponses() {
		this("test_responses", null);
	}

	/**
	 * Create an aliased <code>killbill.test_responses</code> table reference
	 */
	public TestResponses(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses.TEST_RESPONSES);
	}

	private TestResponses(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TestResponses(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.dao.payment.gen.Killbill.KILLBILL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord, org.jooq.types.UInteger> getIdentity() {
		return org.killbill.billing.plugin.dao.payment.gen.Keys.IDENTITY_TEST_RESPONSES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.dao.payment.gen.Keys.KEY_TEST_RESPONSES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.dao.payment.gen.tables.records.TestResponsesRecord>>asList(org.killbill.billing.plugin.dao.payment.gen.Keys.KEY_TEST_RESPONSES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses as(java.lang.String alias) {
		return new org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses rename(java.lang.String name) {
		return new org.killbill.billing.plugin.dao.payment.gen.tables.TestResponses(name, null);
	}
}