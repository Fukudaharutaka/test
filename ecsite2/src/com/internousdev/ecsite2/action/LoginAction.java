		package com.internousdev.ecsite2.action;

		import java.util.Map;
		import org.apache.struts2.interceptor.SessionAware;
		import com internousdev.ecsite2.dao.BuyItemDAO;
		import com.internousdev.ecsite2.dao.LoginDAO;
		import com.internousdev.ecsite2,dto.BuyItemDTO;
		import com.internousdev.dto.LoginDTO;
		import com.opensymphony.xwork2.ActionSupport;

		public class LoginAction extends ActionSupport implements SessionAware {
			private String LoginUserId;
			private String loginPassword;
			public Map<String, Object> session;
			private LoginDAO loginDAO = new LoginDAO();
			private LoginDTO loginDTO = new LoginDTO();
			private BuyItemDAO buyItemDAO = new BuyItemDAO();

			public String execute() {
				String result = ERROR;
				loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
				session.put("loginUser", loginDTO);


			}
		}



		public class LoginAction {

}
