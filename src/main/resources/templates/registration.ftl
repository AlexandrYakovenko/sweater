<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
Add new user
<span style="color: red">${message?ifExists}</span>
<@l.login "/registration" />
</@c.page>