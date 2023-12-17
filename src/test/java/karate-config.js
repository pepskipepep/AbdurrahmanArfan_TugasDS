function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = '';
  }
  var config = {
    env: env,
    username: 'pepskipepep',
    password: 'pepskipepep',
    baseUserURL: 'https://petstore.swagger.io/v2/user'
  }
  // if (env == 'dev') {
  //   config.baseURL = 'https://reqres.in/dev'
  // } else if (env == 'stg') {
  //   config.baseURL = 'https://reqres.in/stg'
  // }

  karate.configure('connectTimeout',30000)
  karate.configure('readTimeout',30000)

  return config;
}