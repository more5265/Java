package com.shop.db;

public class SQL {
	
	// Customer
	public final static String SELECT_CUSTOMER = "SELECT * FROM `customer` WHERE `custId`=?";
	public final static String INSERT_CUSTOMER = "INSERT INTO `customer`SET "
												+ "`custId`=?, "
												+ "`name`=?, "
												+ "`hp`=?, "
												+ "`addr`=?, "
												+ "`rdate`=NOW()";
	
	
	
	public final static String SELECT_CUSTOMERS = "SELECT * FROM `customer`";
	public final static String UPDATE_CUSTOMER = "UPDATE `customer` SET `name`=?, `hp`=?, `addr`=? WHERE `custId`=?";
	public final static String DELETE_CUSTOMER = "DELETE * FROM `customer` WHERE `custId` = ?";
	
	// Order
	//public final static String INSERT_ORDER =
	//public final static String SELECT_ORDER =	
	//public final static String SELECT_ORDERS =
	//public final static String UPDATE_ORDER =
	//public final static String DELETE_ORDER =	
	
	// Product
	
}
