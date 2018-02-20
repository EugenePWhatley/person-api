# person-api

Practice Springboot App with in memory storage for a person api. This has the ability to create, get, and remove person(s).

## How to Run using Gradle
From root directory of project, run `./gradle bootRun` <br />
Currently everything is running on port 8080, at `/persons`

### To stop
From root directory of project, press `Ctrl+C`

## How to Run using Docker
From root directory of project, run `./gradlew clean build` to build the project <br />
After building the project, run `docker build . -t person-api:latest` to build the docker image <br />
After building the docker image, run `docker run --name person_api --publish 8080:8080 --detach person-api`
Currently everything is running on port 8080, at `/persons`

### To stop
From root directory of project, run `docker stop person_api` to stop gracefully (`docker kill person_api` to force)
Remove the container by running `docker rm person_api`
Remove the docker image by running `docker rmi person_api`

## How to Run using docker-compose
From root directory of project, run `./gradlew clean build` to build the project <br />
After building the project, run `docker-compose up -d` to build the docker image and run the container <br />
Currently everything is running on port 8080, at `/persons`

### To stop
From root directory of project, run `docker-compose down --rmi all`

## Operations
### Get Persons
GET /persons <br />
RESPONSE BODY:
```javascript
[
    {
        "id": UUID,
        "name": {
            "first": String,
            "last": String
        },
        "birthday": {
            "month": Integer,
            "day": Integer,
            "year": Integer
        }
    }
]
```

### Add Person
POST /persons <br />
REQUEST BODY: 
```javascript 
{ 
	"name": { 
		"first": String, 
		"last": String 
	}, 
	"birthday": { 
		"month": Integer,
		"day": Interger, 
		"year": Integer 
	}
}
```
RESPONSE HEADERS:
Location: `/persons/{id}

### Get Person
GET /persons/{id} <br />
RESPONSE BODY:
```javascript
{
	"id": UUID,
	"name": {
		"first": String,
		"last": String
	},
	"birthday": {
		"month": Integer,
		"day": Integer,
		"year": Integer
	}
}
```

### Update Person
PUT /persons/{id} <br />
REQUEST BODY: 
```javascript 
{ 
	"name": { 
		"first": String, 
		"last": String 
	}
}
```
RESPONSE BODY:
```javascript 
{ 
	"name": { 
		"first": String, 
		"last": String 
	}, 
	"birthday": { 
		"month": Integer,
		"day": Interger, 
		"year": Integer 
	}
}
```

### Delete Person
DELETE /persons/{id} <br />
RESPONSE BODY:
```javascript 
{ 
	"name": { 
		"first": String, 
		"last": String 
	}, 
	"birthday": { 
		"month": Integer,
		"day": Interger, 
		"year": Integer 
	}
}
```
