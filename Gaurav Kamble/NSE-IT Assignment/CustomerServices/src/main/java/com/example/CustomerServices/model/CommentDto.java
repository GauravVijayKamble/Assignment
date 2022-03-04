package com.example.CustomerServices.model;


import javax.persistence.Id;

public class CommentDto {
	
		
		int cid;
		
		
		
		String cname;
		
		String caddress;
		
		public CommentDto() {
			
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		

		public String getcname() {
			return cname;
		}

		public void setcname(String cname) {
			this.cname = cname;
		}

		public String getcaddress() {
			return caddress;
		}

		public void setcaddress(String caddress) {
			this.caddress = caddress;
		}

		public CommentDto(int cid,  String cname, String caddress) {
			super();
			this.cid = cid;
			
			this.cname = cname;
			this.caddress = caddress;
		}
		

	}



