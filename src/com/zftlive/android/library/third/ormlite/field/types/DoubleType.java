package com.zftlive.android.library.third.ormlite.field.types;

import com.zftlive.android.library.third.ormlite.field.SqlType;

/**
 * Type that persists a double primitive.
 * 
 * @author graywatson
 */
public class DoubleType extends DoubleObjectType {

	private static final DoubleType singleTon = new DoubleType();

	public static DoubleType getSingleton() {
		return singleTon;
	}

	private DoubleType() {
		super(SqlType.DOUBLE, new Class<?>[] { double.class });
	}

	/**
	 * Here for others to subclass.
	 */
	protected DoubleType(SqlType sqlType, Class<?>[] classes) {
		super(sqlType, classes);
	}

	@Override
	public boolean isPrimitive() {
		return true;
	}
}
