<%@ taglib uri="/struts-tags" prefix="s"%>
<s:form action="customerAction">
	<s:textfield name="custId" label="customer id" />
	<s:textfield name="custName" label="customer Name" />
	<s:textfield name="dob" label="Date of birth" type="date"/>

	<s:submit />

</s:form>