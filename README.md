# person-api

Practice Springboot App with in memory storage for a person api. This has the ability to create, get, and remove person(s).

## How to Run using gradle
From root directory of project, run `./gradle bootRun` <br />
Currently everything is running on port 8080, at `/persons`

### To stop
From root directory of project, press `Ctrl+C`

## How to Run using docker
From root directory of project, run `docker-compose up -d` <br />
Currently everything is running on port 8080, at `/persons`

### To stop
From root directory of project, run `docker-compose down`

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
	}, 
	"birthday": { 
		"month": Integer,
		"day": Interger, 
		"year": Integer 
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
