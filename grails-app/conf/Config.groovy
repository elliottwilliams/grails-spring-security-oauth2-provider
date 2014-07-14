// Secure the oauth endpoints
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/oauth/authorize.dispatch':['IS_AUTHENTICATED_REMEMBERED'],
	'/oauth/token.dispatch':['IS_AUTHENTICATED_REMEMBERED'],
]
// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'test.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'test.UserRole'
grails.plugin.springsecurity.authority.className = 'test.Role'

grails.plugin.springsecurity.providerNames = [
		'daoAuthenticationProvider',
		'anonymousAuthenticationProvider',
		'rememberMeAuthenticationProvider',
		'clientCredentialsAuthenticationProvider'
]

grails.plugin.springsecurity.oauthProvider.clients = [
	[
		clientId:"clientId",
		clientSecret:"clientSecret",
		authorizedGrantTypes:["authorization_code", "refresh_token", "client_credentials", "password", "implicit"]
	],
]

grails.serverURL = "http://localhost:8080/test-oauth-server"

log4j = {
	debug	'grails.app.bootstrap.BootStrap',
			'grails.app',
			'grails.plugin.springsecurity.oauthprovider'
	info	'org.hibernate.SQL',
			'org.springframework.security'
	error	'org.codehaus.groovy.grails',
			'org.springframework',
			'org.hibernate'
}

// Uncomment and edit the following lines to start using Grails encoding & escaping improvements

/* remove this line 
// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside null
                scriptlet = 'none' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        filteringCodecForContentType {
            //'text/html' = 'html'
        }
    }
}
remove this line */
