To make the system of the startup more secure i would take the follow actions based on the OWASP Top 10 application security risks for 2021:

- First of all, foster a security-conscious culture within the startup and train all the employees in security related topics. This will prevent a lot of vulnerabilities related to human error.

- Implement a stricter role-based access control. The engineers employees should not have access to the customer data, only to the infrastructure and application code. This action is take based on the principle of least privilege, which consists on giving only the necessary permissions to each role.

- Use a strong encryption to protect sensitive data, including customer information, in transit and at rest.

- Implement security best practices in the web frontend to mitigate common vulnerabilities like XSS and CSRF.

- Regularly review and update configurations for the Kubernetes containers, AWS services, and web application.

- Continuously monitor and update all software components, libraries, and frameworks to address known vulnerabilities.

- Implement proper input validation to prevent malicious data injection and SSRF vulnerabilities in the Python backend.

- Set up alerts for suspicious activities, especially in the customer database and the backend.

- Retain security logs for an adequate duration, following the industry standards and compliance requirements.

- Implement security measures like rate limiting, Web Application Firewall (WAF), and DDoS protection to mitigate common attacks on the app and backend services.