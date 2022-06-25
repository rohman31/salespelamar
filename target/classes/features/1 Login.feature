Feature: Customer Login ke Web Salesindo Pelamar
	Scenario: Testing Login Invalid Customer
	  Given Customer mengakses url
		When Customer login dengan username dan password salah
		Then Customer gagal login
		
	Scenario: Testing Login Valid Customer		
		When Customer login dengan username dan password
		Then Customer berhasil login