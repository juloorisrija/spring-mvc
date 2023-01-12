package com.training.springmvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product>{

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

			Product product = new Product();
			product.setProdId(rs.getInt("prodId"));
			product.setProdName(rs.getString("prodName"));
			product.setProdDesc(rs.getString("prodDesc"));
			product.setPrice(rs.getInt("price"));
			return product;
		}
}

