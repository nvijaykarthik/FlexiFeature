# MessageStoreAndMessageReplay (MSMR Service)

This Service helps to stores the Message(XML or JSON) in NoSql Db and provide an UI replay the messages in the MQ (active MQ).
It listen to a Queue MSMR.IN, in below format
```
<envelop>
  <headers> <!-- this will be injected back to the MQ while replaying in message header -->
     <keyval-pair>
       <key></key>
       <value></value>
     </keyval-pair>
  </headers>
  <searchkeys> <!-- this will be stored as separate fields in the DB so that UI can be used for search -->
    <service-name></service-name>
    <source-queue></source-queue>
    <generated-time></generated-time>
    <status></status> <!-- error or success-->
  <searchkeys>
  <body>
    <messges>
      <![CDATA[
        Actual Payload
      ]]>
      </message>
    <error>
      <![CDATA[
        Error details 
      ]]>
    </error>
  </body>
</envelop>
```
