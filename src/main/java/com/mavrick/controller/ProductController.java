package com.mavrick.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavrick.model.AccountResponse;
import com.mavrick.model.Errormessage;
import com.mavrick.model.Login;
import com.mavrick.model.LoginResponse;
import com.mavrick.model.LoginRq;
import com.mavrick.model.LoginnResponse;
import com.mavrick.model.LoginvalidationResponse;
import com.mavrick.model.ResponseModel;
import com.mavrick.model.TransferRq;
import com.mavrick.model.TransferRs;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	static Logger logger = LoggerFactory.getLogger(ProductController.class);
	

		@PostMapping("verifyCredentials")
		public ResponseEntity<?> verifyCredentials(@RequestBody LoginRq rq) {
			logger.debug("mavi-trans-verifyCredentials API");
			LoginResponse response = new LoginResponse();
			Login login = new Login();
			login.setUserNme("100216");
			login.setPassWord("bnipassword");
			if (login != null) {
				LoginnResponse responseModel = new LoginnResponse();
				LoginvalidationResponse res=new LoginvalidationResponse();
				res.setAccountname(login.getUserNme());
				if ("100216".equals(rq.getAcid()) && "bnipassword".equals(rq.getPassword())) {
					logger.debug("mavi-trans-login success::");
					responseModel.setMessage("success");
					responseModel.setResponsestatuscode(200);
					responseModel.setAccountName(login.getUserNme());
					Errormessage er = new Errormessage();
					responseModel.setError(er);
					response.setMessage("login success");
					response.setResponsestatuscode("200");
					return new ResponseEntity<>(responseModel, HttpStatus.OK);
				} else {
					logger.info("mavi-trans-login failed::");
					logger.info("::");
					responseModel.setMessage("invalid credentials");
					responseModel.setResponsestatuscode(400);
					Errormessage er = new Errormessage();
					er.setCode("400");
					er.setMessage("bad creditials");
					responseModel.setError(er);
					return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
				}
			}else {
				ResponseModel responseModel = new ResponseModel();
				responseModel.setMessage("invalid credentials");
				responseModel.setResponsestatuscode(400);
				Errormessage er = new Errormessage();
				er.setCode("400");
				er.setMessage("bad creditials");
				responseModel.setError(er);
				responseModel.setUserData("login failed");
				return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
			}
	}
		
		@GetMapping("account/balance")
		public ResponseEntity<?> accountBalance(@RequestHeader("accountNo") String accountNo) {
			if(null!=accountNo) {
			AccountResponse acr=new AccountResponse();
			acr.setAccountBalance("150000");
			acr.setAccountName("Tim David");
			Errormessage er = new Errormessage();
			acr.setError(er);
			acr.setMessage("success");
			acr.setResponsestatuscode(200);
			
			return new ResponseEntity<>(acr, HttpStatus.OK);
			}else {
				AccountResponse responseModel = new AccountResponse();
				responseModel.setMessage("invalid accountNumber");
				responseModel.setResponsestatuscode(400);
				Errormessage er = new Errormessage();
				er.setCode("400");
				responseModel.setError(er);
				return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
				
			}
			
			
		}

	@PostMapping("transfer")
	public ResponseEntity<?> transfer(@RequestBody TransferRq rq) {
		if (null != rq) {
			TransferRs rs = new TransferRs();
			rs.setMessage("trasfer successful");
			rs.setResponsestatuscode(200);
			rs.setAccountName("Tim David");
			rs.setAccountBalance("128000");
			return new ResponseEntity<>(rs, HttpStatus.OK);
		} else {
			TransferRs rs = new TransferRs();
			rs.setMessage("trasfer failed, insufficient funds");
			rs.setResponsestatuscode(400);
			rs.setAccountName("Tim David");
			return new ResponseEntity<>(rs, HttpStatus.BAD_REQUEST);

		}
	}
}
