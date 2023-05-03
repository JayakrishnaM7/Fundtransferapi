/*
 * package com.mavrick.serviceImpl;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.dao.EmptyResultDataAccessException; import
 * org.springframework.jdbc.core.BeanPropertyRowMapper; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.web.client.RestTemplate;
 * 
 * import com.mavrick.model.CustomerPreferenceRs; import
 * com.mavrick.model.Login; import com.mavrick.model.LoginRq; import
 * com.mavrick.model.LoginvalidationResponse; import
 * com.mavrick.model.PrefrenecResponse; import
 * com.mavrick.model.Productofferingresponse; import
 * com.mavrick.repository.JdbcRepository; import
 * com.mavrick.serviceI.ProductserviceI;
 * 
 * public class ProductImpl implements ProductserviceI{
 * 
 * static Logger logger = LoggerFactory.getLogger(ProductImpl.class);
 * RestTemplate restTemplate = new RestTemplate();
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * @Autowired private JdbcRepository jdbcRepository;
 * 
 * @Override public PrefrenecResponse getLoginpagePref(String userId) {
 * logger.info("getLoginpagePref called"); try { PrefrenecResponse
 * prefrenecResponse = jdbcRepository.findById(userId);
 * logger.info("PrefrenecResponse called"); if (null != prefrenecResponse) {
 * return prefrenecResponse; } else { return null; } } catch
 * (EmptyResultDataAccessException e) { } return null; }
 * 
 * @Override public Productofferingresponse getDeals(String accountNumber) {
 * logger.info("getDeals called"); try { Productofferingresponse
 * productofferingresponse = jdbcRepository.findById1(accountNumber);
 * logger.info("PrefrenecResponse called"); if (null != productofferingresponse)
 * { return productofferingresponse; } else { return null; }
 * 
 * } catch (EmptyResultDataAccessException e) { } return null; }
 * 
 * 
 * @Override public String getcustomerId(String mobileNumber) {
 * logger.info("getcustomerId called"); PrefrenecResponse tutorial =
 * jdbcTemplate.queryForObject("SELECT * FROM validation WHERE acid=?",
 * BeanPropertyRowMapper.newInstance(PrefrenecResponse.class), mobileNumber);
 * return tutorial.toString(); }
 * 
 * 
 * 
 * @Override public int updatecustPref(String userId) {
 * logger.info("updatecustPref called"); try { int update= jdbcTemplate.
 * update("update preference set enabledisable = 'N' and accountno = ?",
 * userId); logger.info("updatecustPref "+update); if(update==1) { return
 * update; }else { return 0; } }catch(Exception e) {
 * 
 * } return 0; }
 * 
 * @Override public CustomerPreferenceRs getcustPref(String userId) {
 * logger.info("getcustPref():: called"); try { CustomerPreferenceRs
 * customerPreferenceRs =
 * jdbcTemplate.queryForObject("SELECT * FROM Preference WHERE userid=?",
 * BeanPropertyRowMapper.newInstance(CustomerPreferenceRs.class), userId);
 * logger.info("getcustPref called"+customerPreferenceRs.getPtype()); if (null
 * != customerPreferenceRs) { return customerPreferenceRs; } else { return null;
 * } } catch (Exception e) { } return null; }
 * 
 * @Override public Login userLogin(LoginRq loginRq) {
 * logger.info("mavi-trans-userLogin () called ::"); try {
 * if(null!=loginRq.getDeviceId()) { int update =jdbcTemplate.
 * update("update Validation set BindIDMobileNumber = ? where accountno = ?",
 * loginRq.getDeviceId(),loginRq.getAcid()); logger.info("Deviceid "+update); }
 * LoginvalidationResponse prefrenecResponse =
 * jdbcTemplate.queryForObject("SELECT * FROM Validation WHERE acid=?",
 * BeanPropertyRowMapper.newInstance(LoginvalidationResponse.class),
 * loginRq.getAcid()); if(null!=prefrenecResponse) { Login login=new Login();
 * login.setUid(prefrenecResponse.getAcid());
 * login.setPassWord(prefrenecResponse.getPassword());
 * login.setUserNme(prefrenecResponse.getAccountname());
 * 
 * return login; }else { return null; } } catch (Exception e) {
 * e.printStackTrace(); } return null; }
 * 
 * 
 * }
 */