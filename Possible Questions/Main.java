/*
        FLOWCHART
        +----------------+     +-----------------+     +-----------------+
        |   Flowchart    |     |     Shape       |     |     Arrow       |
        +----------------+     +-----------------+     +-----------------+
        |                |     |  - text: String |     |  - from: Shape   |
        +----------------+     |  - x: int       |     |  - to: Shape     |
        |  + draw(): void |     |  - y: int       |     +-----------------+
        |  + addShape():  |     +-----------------+     |  + draw(): void |
        |     void        |                             +-----------------+
        |  + removeShape():|                             |  + setFrom():   |
        |     void        |                             |     void        |
        |                |                             |  + setTo():     |
        |                |                             |     void        |
        +----------------+                             +-----------------+

        UML
        +----------------+      +----------------+      +-----------------+
        |     UML        |      |   Class        |      |    Association  |
        +----------------+      +----------------+      +-----------------+
        |                |      |  - name: String|      |  - name: String |
        +----------------+      |  - attributes: |      |  - multiplicity |
        |  + draw(): void |      |     List       |      |  - navigation   |
        |  + addClass():  |      |  - methods:    |      |  - source: Class|
        |     void        |      |     List       |      |  - target: Class|
        |  + removeClass()|      +----------------+      +-----------------+
        |     void        |      |  + addAttribute(): void               |
        |                |      |  + removeAttribute(): void            |
        |                |      |  + addMethod(): void                  |
        |                |      |  + removeMethod(): void               |
        |                |      |  + addAssociation(): void             |
        |                |      |  + removeAssociation(): void          |
        |                |      |  + setMultiplicity(): void            |
        |                |      |  + setNavigation(): void              |
        |                |      |  + setSource(): void                  |
        |                |      |  + setTarget(): void                  |
        +----------------+      +---------------------------------------+

        ORGANIZATION CHART
        +----------------------+     +-----------------+     +----------------+
        |   Organizational     |     |    Position     |     |     Employee   |
        |        Chart         |     +-----------------+     +----------------+
        +----------------------+     | - title: String |     | - name: String |
        |                      |     | - description:  |     | - position:    |
        |  + draw(): void      |     |     String      |     |     Position   |
        |  + addPosition():    |     | - salary: float

        MIND MAP
        +----------------------+     +-----------------+
        |      Mind Map        |     |      Topic      |
        +----------------------+     +-----------------+
        | - rootTopic: Topic   |     | - text: String  |
        +----------------------+     | - subTopics:    |
        | + draw(): void       |     |     List        |
        | + addTopic(): void   |     +-----------------+
        | + removeTopic(): void|     | + addSubTopic(): |
        |                      |     |     void        |
        |                      |     | + removeSubTopic()|
        |                      |     |     void        |
        +----------------------+     +-----------------+

        FAMILY TREE
        +----------------------+     +-----------------+
        |      Family Tree     |     |       Person    |
        +----------------------+     +-----------------+
        | - rootPerson: Person |     | - name: String  |
        +----------------------+     | - birthDate:    |
        | + draw(): void       |     |     Date        |
        | + addPerson(): void  |     | - gender: Enum  |
        | + removePerson():    |     +-----------------+
        |     void             |     | + addParent():   |
        |                      |     |     void        |
        |                      |     | + addChild():    |
        |                      |     |     void        |
        |                      |     | + removeParent():|
        |                      |     |     void        |
        |                      |     | + removeChild(): |
        |                      |     |     void        |
        +----------------------+     +-----------------+



        */
