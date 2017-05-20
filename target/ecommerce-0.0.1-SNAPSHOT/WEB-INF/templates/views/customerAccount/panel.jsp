<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>




<div class="container">
	<div class="row"
		style="background-color: #FF6F00; height: 30px;color: #ffff;">
		<div class="block-title">
			<strong><span style="font-size: 20px;">Customer Panel</span></strong>
		</div>

	</div>
</div>


<div class="container">
	<div class="row">
		<div class="col-md-4 col-md">
			<div class="block-title">
				<strong><span>My Account</span></strong>
			</div>

			<ul>
				<li class="current"><strong>Panel konta</strong></li>
				<li><a href="http://127.0.0.1/magento/customer/account/edit/">Dane
						konta</a></li>
				<li><a href="http://127.0.0.1/magento/customer/address/">Moje
						adresy</a></li>
				<li><a href="http://127.0.0.1/magento/sales/order/history/">Moje
						zamowienia</a></li>
							
				<li><a href="http://127.0.0.1/magento/review/customer/">Moje
						opinie produktow</a></li>
			
			
				
			</ul>

		</div>


		<div class="col-md-8 col-md">
			<div class="block-title">
				<span> <strong>Welcome, <sec:authentication property="name"/>!</strong><br>
In ont controll panel You can look at your last  activities  or  check status your Orders. </span>			</div>

<div class="box-account box-recent">
    <div class="box-head">
        <h2>Last orders</h2>
        <a href="http://127.0.0.1/magento/sales/order/history/">Show all</a>    </div>

</div>



		</div>
		
		
		

	</div>
</div>