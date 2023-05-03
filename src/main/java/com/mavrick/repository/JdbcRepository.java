/*
 * package com.mavrick.repository;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.dao.IncorrectResultSizeDataAccessException; import
 * org.springframework.jdbc.core.BeanPropertyRowMapper; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.mavrick.ProductApplication; import
 * com.mavrick.model.PrefrenecResponse; import
 * com.mavrick.model.Productofferingresponse;
 * 
 * @Repository public class JdbcRepository implements ProductRepo { static
 * Logger logger = LoggerFactory.getLogger(JdbcRepository.class);
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * 
 * public PrefrenecResponse findById(String id) {
 * logger.info("JdbcRepository findById called"); try { PrefrenecResponse
 * tutorial =
 * jdbcTemplate.queryForObject("SELECT * FROM Validation WHERE acid=?",
 * BeanPropertyRowMapper.newInstance(PrefrenecResponse.class), id);
 * logger.info("JdbcRepository findById called"+tutorial); return tutorial; }
 * catch (IncorrectResultSizeDataAccessException e) { return null; } }
 * 
 * public Productofferingresponse findById1(String accountNumber) {
 * logger.info("JdbcRepository findById1 called"); Productofferingresponse
 * tutorial = null; try { tutorial = jdbcTemplate.
 * queryForObject("SELECT accountNumber,accountName,mobileNumber,productName,Offerimage,GropuName from ProductOffering where accountNumber=?"
 * , BeanPropertyRowMapper.newInstance(Productofferingresponse.class),
 * accountNumber); logger.info("JdbcRepository findById called"+tutorial);
 * }catch (Exception e) { e.printStackTrace(); } if(null!=tutorial) { return
 * tutorial; }else { return null; } }
 * 
 * }
 */