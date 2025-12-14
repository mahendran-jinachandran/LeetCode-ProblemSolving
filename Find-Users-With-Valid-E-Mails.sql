1SELECT * FROM users
2WHERE  mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
3AND mail LIKE BINARY '%@leetcode.com';