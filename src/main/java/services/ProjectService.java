package services;

import br.com.bb.nia.ibm.resources.project.Project;
import jakarta.enterprise.context.RequestScoped;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

@RequestScoped
public class ProjectService {

    public Project teste() {
        try {
            Jsonb mapper = JsonbBuilder.create();
            return mapper.fromJson(this.projectModelMock(),  Project.class);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object teste_json(Project projeto) {
        try {
            Jsonb mapper = JsonbBuilder.create();
            return mapper.toJson(projeto);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private String projectModelMock() {
        return "{\n" +
                "  \"metadata\": {\n" +
                "    \"guid\": \"46a19524-bfbf-4810-a1f0-b131f12bc773\",\n" +
                "    \"url\": \"/v2/projects/46a19524-bfbf-4810-a1f0-b131f12bc773\",\n" +
                "    \"created_at\": \"2019-03-05T23:15:36.175Z\",\n" +
                "    \"updated_at\": \"2019-10-02T19:26:49.684Z\"\n" +
                "  },\n" +
                "  \"entity\": {\n" +
                "    \"name\": \"Project Name\",\n" +
                "    \"description\": \"A project description.\",\n" +
                "    \"type\": \"cpd\",\n" +
                "    \"public\": true,\n" +
                "    \"creator\": \"zapp.brannigan@ibm.com\",\n" +
                "    \"creator_iam_id\": \"IBMid-55000353XF\",\n" +
                "    \"scope\": {\n" +
                "      \"bss_account_id\": \"0821fa9f9ebcc7b7c9a0d6e9bfa72aa4\",\n" +
                "      \"saml_instance_name\": \"my-instance-name\",\n" +
                "      \"enforce_members\": true\n" +
                "    },\n" +
                "    \"storage\": {\n" +
                "      \"type\": \"bmcos_object_storage\",\n" +
                "      \"guid\": \"d0e410a0-b358-42fc-b402-dba83316413a\",\n" +
                "      \"properties\": {\n" +
                "        \"bucket_name\": \"wdp-default\",\n" +
                "        \"bucket_region\": \"us-geo\",\n" +
                "        \"credentials\": {\n" +
                "          \"admin\": {\n" +
                "            \"api_key\": \"Nr0aWPAlj---hlfOMxTfPHe_OWrgH8kqAkqFhUUugqN8\",\n" +
                "            \"service_id\": \"iam-ServiceId-dde7839f-1cca-4626-a499-889398b5d6dd\",\n" +
                "            \"access_key_id\": \"abcdefABCDEF0123456789abcdefABCD\",\n" +
                "            \"secret_access_key\": \"abcdefABCDEF0123456789abcdefABCDEF0123456789abcd\"\n" +
                "          },\n" +
                "          \"editor\": {\n" +
                "            \"api_key\": \"Nr0aWPAlj---hlfOMxTfPHe_OWrgH8kqAkqFhUUugqN8\",\n" +
                "            \"service_id\": \"iam-ServiceId-dde7839f-1cca-4626-a499-889398b5d6dd\",\n" +
                "            \"access_key_id\": \"abcdefABCDEF0123456789abcdefABCD\",\n" +
                "            \"secret_access_key\": \"abcdefABCDEF0123456789abcdefABCDEF0123456789abcd\",\n" +
                "            \"resource_key_crn\": \"crn:v1:bluemix:public:cloud-object-storage:global:a/b56585fe60e71be0a22e6587f781ed91:dc36b4a5-cf81-6541-b855-f68a6f321cac::\"\n"
                +
                "          },\n" +
                "          \"viewer\": {\n" +
                "            \"api_key\": \"Nr0aWPAlj---hlfOMxTfPHe_OWrgH8kqAkqFhUUugqN8\",\n" +
                "            \"service_id\": \"iam-ServiceId-dde7839f-1cca-4626-a499-889398b5d6dd\",\n" +
                "            \"access_key_id\": \"abcdefABCDEF0123456789abcdefABCD\",\n" +
                "            \"secret_access_key\": \"abcdefABCDEF0123456789abcdefABCDEF0123456789abcd\",\n" +
                "            \"resource_key_crn\": \"crn:v1:bluemix:public:cloud-object-storage:global:a/b56585fe60e71be0a22e6587f781ed91:dc36b4a5-cf81-6541-b855-f68a6f321cac::\"\n"
                +
                "          }\n" +
                "        },\n" +
                "        \"key_protect\": true\n" +
                "      }\n" +
                "    },\n" +
                "    \"compute\": [\n" +
                "      {\n" +
                "        \"type\": \"code-assistant\",\n" +
                "        \"guid\": \"630ced06-9675-4e35-a44f-d88197cc10c3\",\n" +
                "        \"name\": \"IBM watsonx Code Assistant\",\n" +
                "        \"credentials\": {},\n" +
                "        \"crn\": \"crn:v1:staging:public:code-assistant:us-south:a/0e79133675a31dbfd10504847a9e174f:630ced06-9675-4e35-a44f-d88197cc10c3::\",\n"
                +
                "        \"label\": \"code-assistant\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"github\": {\n" +
                "      \"repository\": \"git@github.ibm.com:dap/ngp-projects-api.git\"\n" +
                "    },\n" +
                "    \"settings\": {\n" +
                "      \"audit_events\": {\n" +
                "        \"enabled\": true\n" +
                "      },\n" +
                "      \"access_restrictions\": {\n" +
                "        \"data\": true,\n" +
                "        \"reporting\": {\n" +
                "          \"authorized\": true\n" +
                "        }\n" +
                "      },\n" +
                "      \"folders\": {\n" +
                "        \"enabled\": true\n" +
                "      }\n" +
                "    },\n" +
                "    \"members\": [\n" +
                "      {\n" +
                "        \"user_name\": \"zapp.brannigan@ibm.com\",\n" +
                "        \"role\": \"admin\",\n" +
                "        \"id\": \"IBMid-55000353XF\",\n" +
                "        \"state\": \"ACTIVE\",\n" +
                "        \"type\": \"user\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"tools\": [\n" +
                "      \"jupyter_notebooks\",\n" +
                "      \"watson_visual_recognition\",\n" +
                "      \"dashboards\",\n" +
                "      \"streams_designer\",\n" +
                "      \"spss_modeler\",\n" +
                "      \"experiments\",\n" +
                "      \"data_refinery\"\n" +
                "    ]\n" +
                "  }\n" +
                "}";

    }

}
