<#assign aui = PortalJspTagLibs["/WEB-INF/tld/liferay-aui.tld"] />

<#assign fieldName = field.name>

<#if parentField.name??>
	<#assign fieldName = parentField.name!"">
</#if>

<#assign fieldValue = "">

<#if fields?? && fields.get(fieldName)??>
	<#assign fieldValue = fields.get(fieldName).getValue()>
</#if>

<#assign label = field.label!"">

<#if field.showLabel?? && (field.showLabel == "false")>
	<#assign label = "">
</#if>

<#assign parentName = parentField.name!"">
<#assign parentType = parentField.type!"">