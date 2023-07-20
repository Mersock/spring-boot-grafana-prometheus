hello: hello
	echo "hello"
build: build
	docker buildx build -t mersock/demoapp:1 .
install-prometheus: install-prometheus
	helm install bitnami/kube-prometheus
apply: apply
	kubectl apply -f kustomize/
install-grafana: install-grafana
	helm install grafana bitnami/grafana

.PHONY: hello build install-prometheus apply install-grafana